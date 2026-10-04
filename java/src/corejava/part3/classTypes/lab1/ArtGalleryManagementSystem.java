package corejava.part3.classTypes.lab1;

import java.util.Scanner;

public class ArtGalleryManagementSystem {

    static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String artId1 = sc.nextLine();
        String artName1 = sc.nextLine();
        int price1 = Integer.parseInt(sc.nextLine());
        String artistName1 = sc.nextLine();
        String country1 = sc.nextLine();

        String artId2 = sc.nextLine();
        String artName2 = sc.nextLine();
        int price2 = Integer.parseInt(sc.nextLine());
        String artistName2 = sc.nextLine();
        String country2 = sc.nextLine();

        if (price1 < 0 || price2 < 0) {
            System.out.println("Error: Invalid price");
            return;
        }


        ArtPeice.Artist artist1 = new ArtPeice.Artist(artistName1, country1);

        ArtPeice artPiece1 = new ArtPeice(artId1, artName1, price1, artist1);

        ArtPeice.Artist artist2 = new ArtPeice.Artist(artistName2, country2);

        ArtPeice artPiece2 = new ArtPeice(artId2, artName2, price2, artist2);

        ArtPeice[] piece = new ArtPeice[2];
        piece[0] = artPiece1;
        piece[1] = artPiece2;

        for (ArtPeice i : piece) {
            i.printArtDetails();
        }

    }
}


class ArtPeice {

    public String artId;
    public String artName;
    public double price;
    public Artist artist;

    ArtPeice(String artId, String artName, double price, Artist artist) {
        this.artId = artId;
        this.artName = artName;
        this.price = price;
        this.artist = artist;
    }


    static class Artist {
        public String artistName;
        public String country;

        Artist(String artistName, String country) {
            this.artistName = artistName;
            this.country = country;
        }
    }

    public void printArtDetails() {
        System.out.println("Art ID: " + artId);
        System.out.println("Art Name: " + artName);
        System.out.println("Price: " + price);
        System.out.println("Artist: " + artist.artistName);
        System.out.println("Country: " + artist.country);

    }

}

