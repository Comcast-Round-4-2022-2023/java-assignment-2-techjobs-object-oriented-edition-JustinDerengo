package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertTrue(job.getEmployer() instanceof Employer);
        assertTrue(job instanceof Job);
        assertTrue(job.getLocation() instanceof Location);
        assertTrue(job.getPositionType() instanceof PositionType);
        assertTrue(job.getCoreCompetency() instanceof CoreCompetency);
        assertEquals("Product tester", job.getName());
        assertEquals("ACME", job.getEmployer().getValue());
        assertEquals("Desert", job.getLocation().getValue());
        assertEquals("Quality control", job.getPositionType().getValue());
        assertEquals("Persistence", job.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), System.lineSeparator() + "ID: 1\nName: Product tester\nEmployer: ACME\n" +
                "Location: Desert\nPosition Type: Quality control\nCore Competency: Persistence" + System.lineSeparator());
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency("Persistence"));
        assertEquals(job1.toString(), System.lineSeparator() + "ID: 1\nName: Product tester\nEmployer: ACME\n" +
                "Location: Desert\nPosition Type: Quality control\nCore Competency: Persistence" + System.lineSeparator());
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality " +
                "control"), new CoreCompetency(""));
        assertEquals(job1.toString(), System.lineSeparator() + "ID: 1\nName: Product tester\nEmployer: ACME\n" +
                "Location: Desert\nPosition Type: Quality control\nCore Competency: Data not available" + System.lineSeparator());
    }
}
