package iolab;

/**
 *
 * @author Neal
 */
public class ArrayExpansion {
    public static Contact [] expand (Contact [] contacts, Contact c){
        Contact [] bigger = new Contact[(contacts.length + 1)];
        for (int i = 0;i<contacts.length;i++){
            bigger [i] = contacts[i];
        }
        bigger[contacts.length + 1] = c;
        return bigger;
    }
}
