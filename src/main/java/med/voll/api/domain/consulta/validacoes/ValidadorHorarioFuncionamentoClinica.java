package med.voll.api.domain.consulta.validacoes;

import med.voll.api.domain.ValidacaoException;
import med.voll.api.domain.consulta.dto.DadosAgendamentoConsulta;

import java.time.DayOfWeek;

public class ValidadorHorarioFuncionamentoClinica {

    public void validar(DadosAgendamentoConsulta dados) {
        var dataconsulta = dados.data();

        var domingo = dataconsulta.getDayOfWeek().equals(DayOfWeek.SUNDAY);
        var antesDaAberturaClinica = dataconsulta.getHour() < 7;
        var depoisDoEncerramentoClinica = dataconsulta.getHour() < 18;

        if (domingo || antesDaAberturaClinica || depoisDoEncerramentoClinica) {
            throw new ValidacaoException("Consulta fora do horário de funcionamento da clínica");
        }
    }
}
