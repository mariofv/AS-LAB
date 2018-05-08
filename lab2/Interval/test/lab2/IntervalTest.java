package lab2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class IntervalTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructoraCorrecte() throws IntervalIncorrecteException {
		Interval interval = new Interval(01,23,02,34);
		assertEquals(Interval.class, interval.getClass());
	}
	
	@Test
	public void testConstructoraCorrecteFrontera() throws IntervalIncorrecteException{
		Interval interval = new Interval(01,23,01,24);
		assertEquals(Interval.class, interval.getClass());

	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraIgualMinutsFinalMesPetits() throws IntervalIncorrecteException {
		Interval interval = new Interval(01,23,01,20);
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraFiMesPetita() throws IntervalIncorrecteException {
		Interval interval = new Interval(01,23,00,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraIniciMassaPetita() throws IntervalIncorrecteException {
		Interval interval = new Interval(-1,23,00,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraIniciMassaGran() throws IntervalIncorrecteException {
		Interval interval = new Interval(24,23,25,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraMinutsIniciMassaPetits() throws IntervalIncorrecteException {
		Interval interval = new Interval(00,-23,00,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraMinutsIniciMassaGrans() throws IntervalIncorrecteException {
		Interval interval = new Interval(0,60,01,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraFiMassaPetita() throws IntervalIncorrecteException {
		Interval interval = new Interval(01,23,-3,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoraFiMassaGran() throws IntervalIncorrecteException {
		Interval interval = new Interval(04,23,25,20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraMinutsFiMassaPetits() throws IntervalIncorrecteException {
		Interval interval = new Interval(00,23,1,-20);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraMinutsFiMassaGrans() throws IntervalIncorrecteException {
		Interval interval = new Interval(0,00,00,80);
		
	}
	
	@Test(expected = IntervalIncorrecteException.class)
	public void testConstructoraHoresIMinutsIguals() throws IntervalIncorrecteException {
		Interval interval = new Interval(0,00,00,00);
		
	}
	
	@Test
	public void testfunciotemps() throws IntervalIncorrecteException{
		Interval interval = new Interval(8,00,13,35);
		int result = interval.temps();
		assertEquals(335,result);

	}
 
	@Test
	public void testFuncioPeriodeDiaMati() throws IntervalIncorrecteException{
		Interval interval = new Interval(8,00,11,35);
		String periode = interval.periodeDia();
		assertEquals("Mati", periode);

	}
	
	@Test
	public void testFuncioPeriodeDiaTarda() throws IntervalIncorrecteException{
		Interval interval = new Interval(12,01,20,00);
		String periode = interval.periodeDia();
		assertEquals("Tarda", periode);

	}
	
	@Test
	public void testFuncioPeriodeDiaNit() throws IntervalIncorrecteException{
		Interval interval = new Interval(20,01,23,59);
		String periode = interval.periodeDia();
		assertEquals("Nit", periode);

	}
	
	@Test
	public void testFuncioPeriodeDiaDiversosPeriodes() throws IntervalIncorrecteException{
		Interval interval = new Interval(8,00,22,35);
		String periode = interval.periodeDia();
		assertEquals("Diversos Periodes", periode);

	}
	
	@Test (expected = IntervalIncorrecteException.class)
	public void testFuncioMinutsMatiIntervalExcepcio() throws IntervalIncorrecteException{
		Interval interval = new Interval(8,00,22,35);
		int periode = interval.matiInterval();
	}
	
	@Test 
	public void testFuncioMinutsMatiInterval() throws IntervalIncorrecteException{
		Interval interval = new Interval(8,00,11,35);
		int periode = interval.matiInterval();
		assertEquals(215, periode);
	}
	
	
}
