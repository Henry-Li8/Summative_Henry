import java.util.*;

/*
 * Date: 27-28 Octobre 2020
 * Nom de programmeur : Henry Li
 * Description: après avoir fait un tableau 
 * aléatoire de 10 entiers, faites trois méthodes:
 *  une pour additionner tous les nombres ensemble,
 *  une pour trouver tous les nombres pairs,
 *  et une pour enlever le plus petit nombre, 
 *  	en décalant le reste vers l'avant 
 *  et en dupliquant le dernier élément.
 */


public class Summative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Summative moi = new Summative();
		
		System.out.println(moi.saluerAmi("John"));
		//changement dans la method main:
		//J'ai faire un object "moi" d'etre access au method "saluerAmi
		//J'ai utiliser l'objet de utiliser/imprimer le methode
		
		int [] listA = Rand100();
		System.out.println("tableau aléatoire: " + Arrays.toString(listA));
		//j'ai utiliser le method Rand100 de creer un tableau de 100 integers au facon aleotoire
		//j'ai imprimer cette tableau
		PrintNumMax(listA);
		//j'imprime le somme de nombre premiers dans le tableau 
		
		
	}
	public String saluerAmi(String nom) {
		String message = "bonjour mon ami "+nom;
		return message;
		//changements dans la methode SaluerAmi:
		//J'ai ajouter un espace apres "bonjour mon ami" il y aura donc un espace entre le nom et le message d'accueil
		//J'ai ajouter "return message" pour que le message soit renvoyé à la méthode principale
		
	}
	public static int[] Rand100() {
		Random rand = new Random();
		int [] intlist = new int [100];
		for (int i = 0; i<100; i++) {
			intlist[i] = rand.nextInt(100);
		}
		return intlist;
	}
	public static void PrintNumMax(int [] a) {
		int sum = 0;
		int ind = 0;
		for (int i : a) {
			if (i <= 2) {
				sum = sum+i;
			} else {
				for (int d = 2; d<i; d++) {
					if (i%d == 0) {
						ind ++;
					}
				}
				if (ind == 0) {
					sum = sum+i;
				}
				
			}
			
		}
		System.out.println(sum);
	}

}
