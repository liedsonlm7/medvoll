package med.voll.api.domain.consulta.validacoes.agendamento;

import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;

public interface IValidadorAgendamentoDeConsulta {

    void validar (DadosAgendamentoConsulta dados);
}
