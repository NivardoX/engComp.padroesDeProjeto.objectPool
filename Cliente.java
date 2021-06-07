/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectPool.ExercicioI;

/**
 *
 * @author Rick Vidal
 */
public class Cliente {

    public static void main(String[] args) throws Exception {

        try {
            ReaderPool pool = ReaderPool.getInstancia();

            Reader readerX = pool.checkOut();
            readerX.lerArquivo();

            Reader readerY = pool.checkOut();
            System.out.println(readerY.toString());

            pool.checkIn(readerY);
            pool.checkIn(readerX);

            Reader readerZ = pool.checkOut();
            readerZ.lerArquivo();

            readerX = pool.checkOut();
            readerX.lerArquivo();

            pool.checkIn(readerX);

            pool.listarBloqueados();
            pool.listarDesbloqueados();

            pool.checkIn(readerZ);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
