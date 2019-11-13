---
layout: home
title:  "Home"
section: "home"
position: 0
technologies:
 - first: ["Scala", "sbt-microsites plugin is completely written in Scala"]
 - second: ["SBT", "sbt-microsites plugin uses SBT and other sbt plugins to generate microsites easily"]
 - third: ["Jekyll", "Jekyll allows for the transformation of plain text into static websites and blogs."]
---

# Latest Posts

<ul>
  {% assign sorted = (site.data.menu.options | limit: 10 | sort: 'posted') %}
  {% for post in sorted %}
  
  <h3><a href="{{ baseurl }}{{ post.url }}">{{ post.title }}</a></h3>
  <p style="margin-left: 10px"> posted on <b>{{ post.posted }}</b>, category: <b>{{ post.tag }}</b> </p>

  {% endfor %}
</ul>
