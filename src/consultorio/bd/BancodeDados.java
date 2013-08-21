/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package consultorio.bd;

import consultorio.modelo.Paciente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Rafael
 */
public class BancodeDados {

    private static BancodeDados bancodeDados;
    private List<Paciente> pacientes;

    public BancodeDados() {
        pacientes = new ArrayList<Paciente>();
    }

    /**
     * @return the bancodeDados
     */
    public static BancodeDados getBancodeDados() {
        if (bancodeDados == null) {
            bancodeDados = new BancodeDados();
        }
        return bancodeDados;
    }

    /**
     * @param aBancodeDados the bancodeDados to set
     */
    public static void setBancodeDados(BancodeDados aBancodeDados) {
        bancodeDados = aBancodeDados;
    }
}
