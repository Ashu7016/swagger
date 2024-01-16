package service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import dao.CourseRepository;

import java.util.ArrayList;
import java.util.List;

import model.Course;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {CourseService.class})
@ExtendWith(SpringExtension.class)
class CourseServiceDiffblueTest {
    @MockBean
    private CourseRepository courseRepository;

    @Autowired
    private CourseService courseService;

    /**
     * Method under test: {@link CourseService#saveCourse(Course)}
     */
    @Test
    void testSaveCourse() {
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Course Name");
        course.setPrice(10.0d);
        when(courseRepository.save(Mockito.<Course>any())).thenReturn(course);

        //String actualSaveCourseResult = courseService.saveCourse(course);
        verify(courseRepository).save(Mockito.<Course>any());
        //  assertEquals("save Course with id1", actualSaveCourseResult);
    }

    /**
     * Method under test: {@link CourseService#saveCourse(Course)}
     */
    @Test
    void testSaveCourse2() {
        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Course Name");
        course.setPrice(10.0d);
        when(courseRepository.save(Mockito.<Course>any())).thenReturn(course);

        String actualSaveCourseResult = courseService.saveCourse(course);
        verify(courseRepository).save(Mockito.<Course>any());
        //  assertEquals("save Course with id1", actualSaveCourseResult);
    }

    /**
     * Method under test: {@link CourseService#getAllCourse()}
     */
    @Test
    void testGetAllCourse() {
        ArrayList<Course> courseList = new ArrayList<>();
        when(courseRepository.findAll()).thenReturn(courseList);
        List<Course> actualAllCourse = courseService.getAllCourse();
        verify(courseRepository).findAll();
        assertTrue(actualAllCourse.isEmpty());
        //   assertSame(courseList, actualAllCourse);
    }

    /**
     * Method under test: {@link CourseService#deleteCourseById(int)}
     */
    @Test
    void testDeleteCourseById() {
        ArrayList<Course> courseList = new ArrayList<>();
        when(courseRepository.findAll()).thenReturn(courseList);
        doNothing().when(courseRepository).deleteById(Mockito.<Integer>any());
        List<Course> actualDeleteCourseByIdResult = courseService.deleteCourseById(1);
        verify(courseRepository).deleteById(Mockito.<Integer>any());
        verify(courseRepository).findAll();
        assertTrue(actualDeleteCourseByIdResult.isEmpty());
     //   assertSame(courseList, actualDeleteCourseByIdResult);
    }

}
