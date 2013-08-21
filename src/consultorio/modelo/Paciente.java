/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.modelo;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class Paciente {

    private String nome;
    private int RG;
    private int CPF;
    private Date dataNascimento;
    private String endereco;
    private int telefonecelular;
    private int telefoneresidencia;
    private String HGPN;
    private String HA;
    private String HV;
    private String HF;
    private String HS;
    private String antecedentePaterno;
    private String antecedenteMaterno;
    private String planodeSaude;

    void AdicionarEvolucao() {
    }
//    List<Evolucao> ExibirEvolucao(){
//        
//    }

    void GerarGraficodeEvolucao(List<Evolucao> lista) {
    }

    void setPaciente(String nome, int telefoneresi, String PlanodeSaude) {
        this.nome = nome;
        this.telefoneresidencia = telefoneresi;
        this.planodeSaude = PlanodeSaude;
    }
}
