package br.com.cristianofeitosa.gestao_vagas.modules.candidate;

import java.util.UUID;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class CandidateEntity {

  private UUID id;
  private String name;

  @Pattern(regexp = "^(?!\\s*$).+", message = "O nome de usuário deve conter apenas letras, números, pontos, sublinhados ou hífens")
  private String username;

  @Email(message = "Email deve ser válido")
  private String email;

  @Length(min = 10, max = 20, message = "A senha deve conter entre 10 e 20 caracteres")
  private String password;
  private String description;
  private String curriculum;

}
