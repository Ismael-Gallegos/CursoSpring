package med.voll.api.domain.consulta;

import java.time.LocalDate;
import java.time.LocalDateTime;

public record DatosDetalleConsulta(Long id, Long idPaciente, Long idMedico, LocalDateTime fecha) {
}
