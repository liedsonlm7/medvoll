package med.voll.api.domain.consulta.dto;

import jakarta.validation.constraints.NotNull;
import med.voll.api.domain.consulta.model.MotivoCancelamento;

public record DadosCancelamentoConsulta(
        @NotNull
        Long idConsulta,

        @NotNull
        MotivoCancelamento motivo) {
}
