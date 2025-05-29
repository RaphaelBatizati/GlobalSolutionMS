package br.com.fiap.ra_99949.service;

import org.springframework.stereotype.Service;
import br.com.fiap.ra_99949.model.Refugiado;
import br.com.fiap.ra_99949.repository.RefugiadoRepository;

import java.util.List;

@Service
public class RefugiadoService {

    private final RefugiadoRepository repository;

    public RefugiadoService(RefugiadoRepository repository) {
        this.repository = repository;
    }

    public Refugiado salvar(Refugiado refugiado) {
        return repository.save(refugiado);
    }

    public List<Refugiado> listarTodos() {
        return repository.findAll();
    }

    public Refugiado buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Refugiado atualizar(Long id, Refugiado atualizado) {
        Refugiado existente = buscarPorId(id);
        if (existente != null) {
            existente.setNome(atualizado.getNome());
            existente.setIdade(atualizado.getIdade());
            existente.setGenero(atualizado.getGenero());
            existente.setLocalAtual(atualizado.getLocalAtual());
            existente.setStatusSaude(atualizado.getStatusSaude());
            return repository.save(existente);
        }
        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
