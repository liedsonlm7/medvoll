package med.voll.api.domain.medico.dto;

import med.voll.api.domain.endereco.model.Endereco;
import med.voll.api.domain.medico.model.Especialidade;
import med.voll.api.domain.medico.model.Medico;


public record DadosDetalhamentoMedico(Long id, String nome, String email, String crm, String telefone, Especialidade especialidade, Endereco endereco) {

    public DadosDetalhamentoMedico(Medico medico) {
        this(medico.getId(), medico.getNome(), medico.getEmail(), medico.getCrm(), medico.getTelefone(), medico.getEspecialidade(), medico.getEndereco());
    }
}
