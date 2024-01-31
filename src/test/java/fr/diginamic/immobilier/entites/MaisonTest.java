package fr.diginamic.immobilier.entites;

import static org.junit.Assert.*;
import org.junit.Test;

public class MaisonTest {

    @Test
    public void testAjouterPiece() {
        Maison maison = new Maison();

        Piece piece1 = new Chambre(1, 20);
        Piece piece2 = new Salon(0, 30);

        maison.ajouterPiece(piece1);
        maison.ajouterPiece(piece2);

        assertEquals(2, maison.nbPieces());
    }

    @Test
    public void testSuperficieEtage() {
        Maison maison = new Maison();

        Piece piece1 = new Chambre(1, 20);
        Piece piece2 = new Salon(0, 30);

        maison.ajouterPiece(piece1);
        maison.ajouterPiece(piece2);

        assertEquals(30, maison.superficieEtage(0), 0.001);
        assertEquals(20, maison.superficieEtage(1), 0.001);
        assertEquals(0, maison.superficieEtage(2), 0.001);
    }

    @Test
    public void testSuperficieTypePiece() {
        Maison maison = new Maison();

        Piece piece1 = new Chambre(1, 20);
        Piece piece2 = new Salon(0, 30);
        Piece piece3 = new Cuisine(1, 15);
        Piece piece4 = new Chambre(0, 15);

        maison.ajouterPiece(piece1);
        maison.ajouterPiece(piece2);
        maison.ajouterPiece(piece3);
        maison.ajouterPiece(piece4);

        assertEquals(35, maison.superficieTypePiece(Piece.TYPE_CHAMBRE), 0.001);
        assertEquals(30, maison.superficieTypePiece(Piece.TYPE_SALON), 0.001);
        assertEquals(15, maison.superficieTypePiece(Piece.TYPE_CUISINE), 0.001);
    }

    @Test
    public void testCalculerSurface() {
        Maison maison = new Maison();

        Piece piece1 = new Chambre(1, 20);
        Piece piece2 = new Salon(0, 30);
        Piece piece3 = new Cuisine(1, 15);

        maison.ajouterPiece(piece1);
        maison.ajouterPiece(piece2);
        maison.ajouterPiece(piece3);

        assertEquals(65, maison.calculerSurface(), 0.001);
    }

    @Test
    public void testRobustesseParametresNull() {
        Maison maison = new Maison();

        maison.ajouterPiece(null);

        assertNotNull(maison.getPieces());
        assertEquals(0, maison.nbPieces());
        assertEquals(0, maison.superficieEtage(0), 0.001);
        assertEquals(0, maison.superficieTypePiece(Piece.TYPE_CHAMBRE), 0.001);
        assertEquals(0, maison.calculerSurface(), 0.001);
    }
}
