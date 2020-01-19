import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MasinaTestBMW {

	@Test
    public void testSetModel(){
        String expectedModel = "BMW";
        Masina masina = new Masina("BMW", 50000d);
        masina.setModel(expectedModel);

        Assert.assertEquals(masina.getModel(),expectedModel);
    }
    @Test
    public void testConstructor(){
        String expected = "BMW";
        double expP = 50000d;
        double delta = 0.17;
        Masina masina = new Masina (expected,expP);

        Assert.assertEquals(masina.getModel(),expected);
        Assert.assertEquals(masina.getPret(),expP, delta);
    }

    @Test
    public void testConstructorCrossCheck(){
        String expected = "BMW";
        double expP = 50000d;
        double delta = 0.17;
        Masina masina1 = new Masina (expected,expP);
        Masina masina2 = new Masina ();
        masina2.setModel(expected);
        masina2.setPret(expP);

        Assert.assertEquals(masina1.getModel(),expected);
        Assert.assertEquals(masina2.getPret(),expP, delta);

        Assert.assertEquals(masina1.getModel(),masina2.getModel());
        Assert.assertEquals(masina1.getPret(),masina2.getPret(), delta);
    }

}
