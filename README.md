# Nocode functions: each function has its own repo

In this "parent" repo for all functions, you will find:

- the data structure (the model) common to all functions. Please visit the folder "[functions-model](https://github.com/seinecle/functions-model-and-parent-build/tree/main/functions-model)".

- the file 'pom.xml' which defines the versions of all the dependencies shared by the functions

# License

All functions are licensed '[Creative Commons Attribution 4.0 International Public License](https://creativecommons.org/licenses/by/4.0/)', which essentially means that **the code and the assets of these functions can be used and modified including for commercial purposes, provided an attribution is made to the author (Clement Levallois)**.

# List of the functions and where to find them

All the functions can be used for free at [https://nocodefunctions.com](https://nocodefunctions.com).

For the sources:

- umigon: [sentiment analysis for social media in English, French and Spanish](https://github.com/seinecle/umigon-family)

- gaze: [create networks from lists of items](https://github.com/seinecle/Gaze)

- cowo: [create networks from texts](https://github.com/seinecle/cowo-function)

- topics: [extract topics from texts](https://github.com/seinecle/topics-detection-function)

- predict links: [predict the links that are most likely to form next in a network](https://github.com/seinecle/LinkPrediction)

- pdf matcher: [explore many pdfs to find specific keywords in context](https://github.com/seinecle/pdf-matcher)

- gexf <-> vosviewer converter: [get from gexf to vosviewer and back - and visualize them on the web](https://github.com/seinecle/gexf-vosviewer-converter)

- css highlighter:  [a tool to get a word highlighted with css](https://github.com/seinecle/nocodefunctions-web-app/blob/master/src/main/java/net/clementlevallois/nocodeapp/web/front/functions/HighlighterBean.java). Note that this function is embedded in the web app as it takes just a few lines of code - no need for a separate repo.

- data annotation: [an app to annotate datasets, including with the Best-Worst Scaling method](https://github.com/seinecle/BIBD). Please note that this function is 90% ready and would need a dedicated user / tester to become fully operational. If you are this person, get in touch!

- the [API server to access all these functions](https://github.com/seinecle/nocodefunctions-as-api), to run them through a web access. This is how the front of nocodefunctions accesses them, by the way.

# The two other essential repos of nocodefunctions:

- [the web front](https://github.com/seinecle/nocodefunctions-web-app)
- [the i/o machinery, to import your data to the app and then export the results back to users](https://github.com/seinecle/nocodefunctions-io). Currently supported formats include txt, pdf, csv, tsv, excel and tweets.

# Author

[Clement Levallois](https://twitter.com/seinecle)