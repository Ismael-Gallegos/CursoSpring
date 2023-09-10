package med.voll.api.domain.medico;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.domain.direccion.DatosDireccion;

public record DatosRegistroMedico(

        @NotBlank(message = "El Nombre es Obligatorio")
        String nombre,
        @NotBlank(message = "El Email es Obligatorio")
        @Email(message = "El formato de Email es inválido")
        String email,
        @NotBlank(message = "El Teléfono es Obligatorio")
        String telefono,
        @NotBlank(message = "El Documento es Obligatorio y debe contener de 4 a 6 digitos")
        @Pattern(regexp = "\\d{4,6}")
        String documento,
        @NotNull(message = "La Especilidad es Obligatoria")
        Especialidad especialidad,
        @NotNull(message = "Los datos de la dirección son Obligatorios")
        @Valid
        DatosDireccion direccion) {
}
