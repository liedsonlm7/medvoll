package med.voll.api.domain.consulta.validacoes.cancelamento;

import med.voll.api.domain.consulta.dto.DadosCancelamentoConsulta;

public interface IValidadorCancelamentoConsulta {
    void validar(DadosCancelamentoConsulta dados);
}
