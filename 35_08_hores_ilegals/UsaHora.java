/*
 * Copyright 2022 Javier García Vera
 *
 * This is free software, licensed under the GNU General Public License V3.
 * See http://www.gnu.org/licenses/gpl.html for more information
 *
 */
//Aquest programa controla el funcionament de hora
import java.io.*;
public class UsaHora {
    public static void main(String[] args) {
        System.out.println("Intentarem crear una hora amb valors no vàlids");
        try {
            Hora hora = new Hora(-1, 1, 1);
        } catch (IllegalArgumentException e) {
            System.out.println("Argument il·legal!");
        }
    }
}
