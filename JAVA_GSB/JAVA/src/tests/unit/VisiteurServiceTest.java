package tests.unit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.TestCase;
import service.VisiteurService;

class VisiteurServiceTest extends TestCase {

	@BeforeEach
	protected void setUp() throws Exception {
		super.setUp();
	}

	@AfterEach
	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	final void testRechercherVisiteurNull() {
		assertNull(VisiteurService.rechercherVisiteur("a11"));
	}
	
	@Test
	final void testRechercherVisiteOk() {
		assertEquals("visiteur trouvé", "a131", VisiteurService.rechercherVisiteur("a131").getMatricule());
	}

}
