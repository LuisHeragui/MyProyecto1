package mx.unam.ciencias.myp;

/**
 * Clase abstracta para representar a un usuario.
 */
public abstract class Usuario {

    /* El menú de las acciones del usuario. */
    protected Menu menu;

    /**
     * Define el menú del usuario.
     * @param menu el menú del usuario.
     */
    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    /**
     * Imprime el menú de las acciones del usuario.
     */
    public void imprimirMenu() {
        menu.imprimirMenu();
    }
}
