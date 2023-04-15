
/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Envolta strings per a fer equals
public class EnvoltaString {
    private String valor;


    public EnvoltaString(String valor) { this.valor = (valor); }


    @Override
    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }


    @Override
    public boolean equals(Object obj) {

        if (obj instanceof EnvoltaString) {  // si ja ni tant sols és ni un EnvoltaString malament

            EnvoltaString altre = (EnvoltaString) obj;

            return valor.equalsIgnoreCase(altre.valor);

        }

        return false;

    }
}
