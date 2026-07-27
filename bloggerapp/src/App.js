import React from "react";
import BookDetails from "./Components/BookDetails";
import BlogDetails from "./Components/BlogDetails";
import CourseDetails from "./Components/CourseDetails";

function App() {

    const showBooks = true;
    const showBlogs = true;
    const showCourses = false;

    return (
        <div style={{ margin: "20px" }}>

            <h1>Blogger App</h1>

            {/* Method 1 : If using ternary operator */}
            {showBooks ? <BookDetails /> : <h3>Books Not Available</h3>}

            <hr />

            {/* Method 2 : Logical AND */}
            {showBlogs && <BlogDetails />}

            <hr />

            {/* Method 3 : Logical OR */}
            {!showCourses || <CourseDetails />}

        </div>
    );
}

export default App;