package controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Course;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import service.CourseService;

@ContextConfiguration(classes = {CourseController.class})
@ExtendWith(SpringExtension.class)
class CourseControllerTest {
    @Autowired
    private CourseController courseController;

    @MockBean
    private CourseService courseService;

    /**
     * Method under test: {@link CourseController#deleteCourseById(int)}
     */
    @Test
    @Disabled("TODO: Complete this test")
    void testDeleteCourseById() throws Exception {


        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/deleteCourse/{courseId");
      //  MockMvcBuilders.standaloneSetup(courseController).build().perform(requestBuilder);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testGetAllCourses() throws Exception {

        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.get("/course/getCourse");
        // MockMvcBuilders.standaloneSetup(courseController).build().perform(requestBuilder);
    }

    @Test
    @Disabled("TODO: Complete this test")
    void testSaveCourse() throws Exception {

        Course course = new Course();
        course.setCourseId(1);
        course.setCourseName("Course Name");
        course.setPrice(10.0d);
        String content = (new ObjectMapper()).writeValueAsString(course);
        MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/course/save")
                .contentType(MediaType.APPLICATION_JSON)
                .content(content);
        // MockMvcBuilders.standaloneSetup(courseController).build().perform(requestBuilder);
    }
}
