import React from "react";
import CohortDetails from "./Components/CohortDetails";

function App() {
  return (
    <div>
      <CohortDetails
        name="React"
        status="ongoing"
        coach="John"
        trainer="David"
      />

      <CohortDetails
        name="Angular"
        status="completed"
        coach="Smith"
        trainer="Kevin"
      />

      <CohortDetails
        name="Java"
        status="ongoing"
        coach="Peter"
        trainer="James"
      />
    </div>
  );
}

export default App;