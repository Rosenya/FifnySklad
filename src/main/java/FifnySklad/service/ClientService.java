package FifnySklad.service;

import FifnySklad.model.Client;
import FifnySklad.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class ClientService {

    private ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    //motoda dodająca klientów
        public void addClient (Client client){
        clientRepository.save(client);
        log.info("Dodano klienta o id: " + client.getId());
    }
    //metoda pokazująca wszystkich klientów
    public List<Client> getClients(){
        return clientRepository.findAll();
    }
    //metoda pokazująca jednego klienta
    public Client getClient(Long id){
        return clientRepository.findById(id).orElse(null);
    }
    //edycja klienta
    public void editClient(Client client){
        clientRepository.save(client);
    }
    //usuwanie klienta
    public void deleteClientById(Long id){
        clientRepository.deleteById(id);
        log.info("usunięto klienta o id" + id);
    }

}
