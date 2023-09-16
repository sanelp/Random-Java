public class PopulationProjection {
    public static void main(String[] args) {
        // Regne ut sekunder i 1 aar
        double secondInYears = 60 * 60 * 24 * 365;
        // konverterer fodsel per sekund per aar
        double birthPerYear =  secondInYears / 7.0;
        // konverterer deaths per sekund per år
        double deathPerYear =  secondInYears / 13.0;
        // konverterer dano per sekund per år
        double danoPerYear =  secondInYears / 45.0;

        double totalProjection =  birthPerYear - deathPerYear + danoPerYear;

        int currentPopulation = 312032486;

        System.out.println("Population 1 year: " + (int)(currentPopulation + (1 * totalProjection)));
        System.out.println("Population 2 year: " + (int)(currentPopulation + (2 * totalProjection)));
        System.out.println("Population 3 year: " + (int)(currentPopulation + (3 * totalProjection)));
        System.out.println("Population 4 year: " + (int)(currentPopulation + (4 * totalProjection)));
        System.out.println("Population 5 year: " + (int)(currentPopulation + (5 * totalProjection)));
    }
}
