package med.voll.api.paciente.dto;

import jakarta.validation.Valid;
import med.voll.api.endereco.dto.DadosEndereco;

public record DadosAtualizacaoPaciente(Long id, String nome, String telefone, @Valid DadosEndereco endereco) {
}
