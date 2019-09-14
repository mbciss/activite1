public final class TabAlgos {
  /**
   *
   * @param args arg
   */
  public static void main(final String[] args) {

    //System.out.println("------ Test method plus grand ------");
    testPlusGrand();
    testMoyenne();
    testEgaux();
    testSimilaires();
  }

  /**.
   * Test de la méthode plusGrand
   */
  public static void testPlusGrand() {
    final int[] tab = {5, 3, 259, 5, 45};
    final int nombre = 259;
    if (nombre == plusGrand(tab)) {
      System.out.println(nombre + " est la plus grande valeur "
              + "du tableau {5, 3, 259, 5, 45}");
    }
  }
  /**
   *
   * @param tab entier
   * @return le plus grand entier
   */
  public static int plusGrand(final int[] tab) {
    int plusGrand = 0;
    for (int elmt : tab) {
      if (elmt > plusGrand) {
        plusGrand = elmt;
      }
    }
    return plusGrand;
  }


  /**.
   * Test de la méthode moyenne
   */
  public static void testMoyenne() {
    final int[] tab = {2, 3, 5, 10, 100};
    final int nombre = 24;
    if (nombre == moyenne(tab)) {
      System.out.println("La moyenne du tableau "
              + "{2, 3, 5, 10, 100} fait bien 24");
    }
  }

  /**
   * @param tab est un tableau
   * @return moyenne des valeurs du tableau.
   * @throw IllegalArgumentException si tab et null ou vide.
   **/
  public static double moyenne(final int[] tab) {

    if (tab == null) {
      throw new IllegalArgumentException();
    } else {
      double somme = 0;
      int nbcase = 0;
      for (int elmt : tab) {
        somme = somme + elmt;
        nbcase++;
      }
      if (nbcase == 0) {
        throw new IllegalArgumentException();
      }
      return somme / nbcase;
    }
  }

  /**.
   * testEgaux
   */
  public static void testEgaux() {
    final int[] tab1 = {5, 3, 259, 5, 45};
    final int[] tab2 = {5, 3, 259, 5, 45};

    if (egaux(tab1, tab2)) {
      System.out.println("Les deux tableaux sont égaux");
    } else {
      System.out.println("Les deux tableaux ne sont pas égaux");
    }

  }

  /**
   * @param tab1 tableau 1
   * @param tab2 tableau 2
   * Compare le contenu de 2 tableaux en tenant compte de l'ordre.
   * @return true si les 2 tableaux contiennent les mêmes éléments
   *         avec les mêmes nombres d'occurences
   *         (avec les elements dans le meme ordre).
   **/
  public static boolean egaux(final int[] tab1, final int[] tab2) {

    // On compte et on compare d'abord le nombre d'éléments des deux tableaux;
    int nbElementTab1 = 0;
    int nbElementTab2 = 0;

    for (int elmt : tab1) {
      nbElementTab1++;
    }

    for (int elmt : tab2) {
      nbElementTab2++;
    }

    if (nbElementTab1 != nbElementTab2) {
      return false;
    } else {

      for (var i = 0; i < nbElementTab1; i++) {
        if (tab1[i] != tab2[i]) {
          return false;
        }
      }

      return true;
    }
  }


  /**.
   * Test de la méthode similaires
   */
  public static void testSimilaires() {
    final int[] tab1 = {5, 3, 259, 2, 45};
    final int[] tab2 = {259, 5, 45, 3, 2};

    if (similaires(tab1, tab2)) {
      System.out.println("Les deux tableaux contiennent les memes éléments");
    } else {
      System.out.println("Les deux tableaux ne contiennent "
              + "pas les memes éléments");
    }
  }

  /**
   * @param tab1 tableau 1
   * @param tab2 tableau 2
   * Compare le contenu de 2 tableaux sans tenir compte de l'ordre.
   * @return true si les 2 tableaux contiennent les mêmes éléments
   *         avec les mêmes nombres d'occurrence
   *         (pas forcément dans le meme ordre).
   **/
  public static boolean similaires(final int[] tab1, final int[] tab2) {

    // On compte et on compare d'abord le nombre d'éléments des deux tableaux;
    int nbElementTab1 = 0;
    int nbElementTab2 = 0;

    for (int elmt : tab1) {
      nbElementTab1++;
    }

    for (int elmt : tab2) {
      nbElementTab2++;
    }

    boolean conforme = false;

    if (nbElementTab1 != nbElementTab2) {
      return false;
    } else {

      // On prend chaque élément du premier tableau et on verifie qu'il
      // existe dans l'autre tableau
      boolean existe = false;
      for (var i = 0; i < nbElementTab1; i++) {
        for (var j = 0; j < nbElementTab2; j++) {
          if (tab1[i] == tab2[j]) {
            existe = true;
          }
        }

        if (existe) {
          conforme = true;
        } else {
          conforme = false;
          return conforme;
        }
        existe = false;
      }
    }

    return conforme;

  }

}
