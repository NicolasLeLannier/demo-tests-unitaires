/**
 *
 */
package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * @author Nicolas LE LANNIER
 */
public class SaisonTest {

	 @Test
	    public void testNominalCases() {
	        assertEquals(Saison.PRINTEMPS, Saison.valueOfLibelle("Printemps"));
	        assertEquals(Saison.ETE, Saison.valueOfLibelle("Eté"));
	        assertEquals(Saison.AUTOMNE, Saison.valueOfLibelle("Automne"));
	        assertEquals(Saison.HIVER, Saison.valueOfLibelle("Hiver"));
	    }

	    @Test
	    public void testNullInput() {
	        assertNull(Saison.valueOfLibelle(null));
	    }

	    @Test
	    public void testInvalidInput() {
	        assertNull(Saison.valueOfLibelle("InvalidSaison"));
	    }

}
