package FifnySklad.controller;

import FifnySklad.model.Client;
import FifnySklad.service.ClientService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //getAllClients, potrzebujemy widoku
    @GetMapping("/clients")
    public String getClientList(Model model){
        List<Client> clients = clientService.getClients();
        model.addAttribute("client", clients);
        return "clients/clientsList";
    }
    //widok dla nowego klienta
    @GetMapping("/addClient")
    public String addClient(){
        return "clients/addNewClient";
    }
    @GetMapping("/editClient/{id}")
    public String getEditClient(@PathVariable("id") Long id, Model model){
        Client client = clientService.getClient(id);
        model.addAttribute("client", client);
        return "client/editClient";
    }
    @PostMapping("/addClient/{id}")
    public RedirectView postEditClient (@ModelAttribute Client newClient, @PathVariable("id") Long id){
        clientService.editClient(newClient);
        return new RedirectView("/editClient/{id}");
    }

    @PostMapping("/editStudent/{id}")
    public RedirectView deleteClient(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
        return new RedirectView("clients");
    }


}
