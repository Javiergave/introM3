/*
 * Copyright 2022 Javier García Vera
 * 
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 * 
 */
//Aquest programa envolcalla elements de la clase String i crea un nou equals per a que es puguin igualar encara que tinguin diferent capitalització
public class EnvoltaString {
    private String valor;


    public EnvoltaString(String valor) { this.valor = (valor); }


    @Override
    public String toString() { return String.format("ENVOLTAT(\"%s\")", valor); }


    @Override
    public boolean equals(Object obj) {

        if (obj instanceof EnvoltaString) {  // si ja ni tant sols és ni un EnvoltaString malament

            EnvoltaString altre = (EnvoltaString) obj;

            return ((String)valor).equalsIgnoreCase(altre.valor);

        }
        else if (obj instanceof String){
            EnvoltaString altre = new EnvoltaString((String)obj);
            return ((String)valor).equalsIgnoreCase((String)altre.valor);
        }

        return false;

    }
}
