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
  {% assign lim = 10 %}
  {% assign sorted = (site.data.menu.options | limit: lim | sort: 'posted') %}
  {% for post in sorted %}

    {% if post.tag != "categories" %}
    
      <h3><a href="{{ baseurl }}{{ post.url }}">{{ post.title }}</a></h3>
      <p style="margin-left: 10px; margin-top: -30px"> posted on <b>{{ post.posted }}</b>, category: <b>{{ post.tag }}</b> </p>
      {% assign lim -= 1 %}

    {% else %}

      
      {% assign category_posts = post.nested_options %}

      {% if category_posts | length > 1 %}
        {% assign category_sorted = (category_posts | limit: lim | sort: 'posted') %}
          {% for category_post in category_sorted %}
    
            <h3><a href="{{ baseurl }}{{ category_post.url }}">{{ category_post.title }}</a></h3>
            <p style="margin-left: 10px; margin-top: -30px"> posted on <b>{{ category_post.posted }}</b>, category: <b>{{ category_post.tag }}</b> </p>
            {% assign lim -= 1 %}

          {% endfor %}
      {% endif %}
    
    {% endif %}

  {% endfor %}
</ul>
