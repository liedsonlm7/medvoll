package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;

public interface IValidadorAgendamentoDeConsulta {

    void validar (DadosAgendamentoConsulta dados);
}
