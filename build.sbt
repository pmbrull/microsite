organizationName := "pmbrull"
enablePlugins(MicrositesPlugin)

// Microsite settings
// Description
micrositeName := "pmbru\\\\"
micrositeAuthor := "pmbrull"
micrositeOrganizationHomepage := "https://www.pmbrull.github.io/microsite/"
micrositeHomepage := "https://pmbrull.github.io/microsite/"
micrositeDescription := "Personal blog"
micrositeDocumentationLabelDescription := "Content"

micrositeUrl := "https://pmbrull.github.io"
micrositeBaseUrl := "/microsite"
micrositeTheme := "light"

// Social
micrositeGitterChannel := false
micrositeShareOnSocial := false

// Resource organization
micrositeDocumentationUrl := "microsite/content/"
resourceDirectory in Compile := baseDirectory.value / "docs"
micrositeDataDirectory := (resourceDirectory in Compile).value / "resources" / "data"
micrositeImgDirectory := (resourceDirectory in Compile).value / "resources" / "img"
micrositeCssDirectory := (resourceDirectory in Compile).value / "resources" / "styles"

// Github
micrositeGithubOwner := "pmbrull"
micrositeGithubRepo := "microsite"
micrositeGithubToken := sys.env.get("micrositeToken")
micrositePushSiteWith := GitHub4s

// Meta
includeFilter in makeSite := "*.html" | "*.css" | "*.png" | "*.jpg" | "*.gif" | "*.js" | "*.swf" | "*.md" | "*.svg"
