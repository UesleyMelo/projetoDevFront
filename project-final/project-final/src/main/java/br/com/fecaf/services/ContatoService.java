package br.com.fecaf.services;

import br.com.fecaf.model.Contato;
import br.com.fecaf.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;


    public List<Contato> listarContatos () {
        List<Contato> contatoList = contatoRepository.findAll();

        for (Contato contato : contatoList) {
            System.out.println(contato.getId());
            System.out.println(contato.getNome());
        }

        return contatoList;
    }



}
