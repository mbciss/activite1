/**
* Ma class d'exemple.
*/

public class Exemple {
 /**
  * @see t
  */
private final String t;
 /**
  * @see v
  */
private final int v;

 /**
  * @param a
  * initialise la variable t
  */
public Exemple(final String a) {
  this.t = a;
 }

 /**
  *
  * @return v
  */
 public final int getV() {
  return this.v;
 }

 /**
  * @param b
  * initialiser la variable v
  */
 public final void setV(final int b) {
  this.v = b;
 }

 /**
  *
  * @return v si positif
  */
 public final String getT() {
    if (v > 0) {
     return t;
    }
 }

}
