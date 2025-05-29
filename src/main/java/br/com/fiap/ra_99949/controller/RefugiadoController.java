package br.com.fiap.ra_99949.controller;

import org.springframework.web.bind.annotation.*;
import br.com.fiap.ra_99949.dto.RefugiadoDTO;
import br.com.fiap.ra_99949.model.Refugiado;
import br.com.fiap.ra_99949.service.RefugiadoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/refugiados")
public class RefugiadoController {

    private final RefugiadoService service;

    public RefugiadoController(RefugiadoService service) {
        this.service = service;
    }

    @PostMapping
    public Refugiado salvar(@RequestBody RefugiadoDTO dto) {
        Refugiado refugiado = new Refugiado();
        refugiado.setNome(dto.getNome());
        refugiado.setIdade(dto.getIdade());
        refugiado.setGenero(dto.getGenero());
        refugiado.setLocalAtual(dto.getLocalAtual());
        refugiado.setStatusSaude(dto.getStatusSaude());
        return service.salvar(refugiado);
    }

    @GetMapping
    public List<Refugiado> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Refugiado buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Refugiado atualizar(@PathVariable Long id, @RequestBody RefugiadoDTO dto) {
        Refugiado atualizado = new Refugiado();
        atualizado.setNome(dto.getNome());
        atualizado.setIdade(dto.getIdade());
        atualizado.setGenero(dto.getGenero());
        atualizado.setLocalAtual(dto.getLocalAtual());
        atualizado.setStatusSaude(dto.getStatusSaude());
        return service.atualizar(id, atualizado);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}
