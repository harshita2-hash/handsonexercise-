import React from "react";

function BlogDetails() {

    const blogs = [
        { id: 1, title: "React Introduction", writer: "Harshita" },
        { id: 2, title: "Learning JavaScript", writer: "Anjali" }
    ];

    return (
        <div>
            <h2>Blog Details</h2>

            <ul>
                {
                    blogs.map(blog => (
                        <li key={blog.id}>
                            <b>{blog.title}</b> - {blog.writer}
                        </li>
                    ))
                }
            </ul>
        </div>
    );
}

export default BlogDetails;