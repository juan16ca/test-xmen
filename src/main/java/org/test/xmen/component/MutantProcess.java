package org.test.xmen.component;

import org.springframework.stereotype.Component;

@Component
public class MutantProcess {

	public static boolean isMutant(char a, char b, char c, char d) {
		
		return a == b && b == c && c == d;
	}

	public static boolean isMutant(String[] dna) {

		boolean isMutant = false;
		int tamanio = dna.length;

		for (int i = 0; i < dna.length; i++) {

			for (int j = 0; j < dna.length; j++) {

				if (i + 4 <= tamanio) {

					// Validacion oblicua
					if (j >= 3) {
						// Validacion derecha a izquierda oblicua
						isMutant = isMutant(dna[i].charAt(j), dna[i + 1].charAt(j - 1), dna[i + 2].charAt(j - 2),
								dna[i + 3].charAt(j - 3));

						if (isMutant) {
							return true;
						}

					} else {
						// Validacion izquierda a derecha oblicua
						isMutant = isMutant(dna[i].charAt(j), dna[i + 1].charAt(j + 1), dna[i + 2].charAt(j + 2),
								dna[i + 3].charAt(j + 3));

						if (isMutant) {
							return true;
						}
					}

					// Validacion vertical
					isMutant = isMutant(dna[i].charAt(j), dna[i + 1].charAt(j), dna[i + 2].charAt(j),
							dna[i + 3].charAt(j));

					if (isMutant) {
						return true;
					}

				}

				// Validacion horizontal
				if (j + 4 <= tamanio) {

					isMutant = isMutant(dna[i].charAt(j), dna[i].charAt(j + 1), dna[i].charAt(j + 2),
							dna[i].charAt(j + 3));

					if (isMutant) {
						return true;
					}

				}				

			}

		}

		return isMutant;

	}

}
