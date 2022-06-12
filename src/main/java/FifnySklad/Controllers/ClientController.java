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

import java.awt.image.Kernel;
import java.util.List;

@Controller
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    //getAllClients, potrzebujemy widoku
    @GetMapping("/zamowienie")
    public String getClientList(Model model){
        List<Client> clients = clientService.getClients();
        model.addAttribute("Klient", clients);
        return "zamowienie";
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
        return "edycjaKlienta";
    }

    @PostMapping("/editClient/{id}")
    public RedirectView deleteClient(@PathVariable("id") Long id){
        clientService.deleteClientById(id);
        return new RedirectView("clients");
    }
    @PostMapping("/formularz/{id}")
    public RedirectView postEditClient (@ModelAttribute Client newClient, @PathVariable("id") Long id){
        clientService.editClient(newClient);
        return new RedirectView("/editClient/{id}");
    }

    @GetMapping("/formularz")
    public String getFormularz() {

        return "formularz";
    }

    @PostMapping("/formularz")
    public RedirectView postAddClient (@ModelAttribute Client newClient){
        clientService.addClient(newClient);
        return new RedirectView("/zamowienie");
    }


}
