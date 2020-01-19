import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MasinaTestAudi {

	@Test
    public void testSetModel(){
        String expectedModel = "Audi";
        Masina masina = new Masina("Audi", 70000d);
        masina.setModel(expectedModel);

        Assert.assertEquals(masina.getModel(),expectedModel);
    }
    @Test
    public void testConstructor(){
        String expected = "Audi";
        double expP = 70000d;
        double delta = 0.17;
        Masina masina = new Masina (expected,expP);

        Assert.assertEquals(masina.getModel(),expected);
        Assert.assertEquals(masina.getPret(),expP, delta);
    }

    @Test
    public void testConstructorCrossCheck(){
        String expected = "Audi";
        double expP = 70000d;
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
