package med.voll.api.medico;

import med.voll.api.endereco.DadosEnderco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade,
                                  DadosEnderco endereco) {

}
