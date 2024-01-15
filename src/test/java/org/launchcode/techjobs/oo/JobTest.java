package org.launchcode.techjobs.oo;

import org.junit.Test;

import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1, job2);
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("Product tester", "Product tester");;
        assertEquals("ACME", "ACME");;
        assertEquals("Desert", "Desert");
        assertEquals("Quality Control", "Quality Control");
        assertEquals("Persistence", "Persistence");
        assertTrue(test_job.getName() instanceof String);
        assertTrue(test_job.getEmployer() instanceof Employer);
        assertTrue(test_job.getLocation() instanceof Location);
        assertTrue(test_job.getPositionType() instanceof PositionType);
        assertTrue(test_job.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        Job test_job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test_job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertNotEquals(test_job2.getId(), test_job3.getId());
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job test_job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(test_job4.toString().startsWith("\n"));
        assertTrue(test_job4.toString().endsWith("\n"));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job test_job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job5.toString(), "\n" + "ID: 4" + "\n" + "Name: Product tester" + "\n" + "Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" + "Core Competency: Persistence" + "\n");
        assertEquals(6, 6);;
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job test_job6 = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(test_job6.toString(),"\n" + "ID: 3" + "\n" + "Name: Data not available" + "\n" +"Employer: ACME" + "\n" + "Location: Desert" + "\n" + "Position Type: Quality control" + "\n" +"Core Competency: Persistence" + "\n");
    }
}
