# lein-webdav

A Leiningen plugin that enables deploying to a webdav repository.

## Rationale

You can currently deploy to a webdav repo by adding:

    [org.apache.maven.wagon/wagon-webdav-jackrabbit "2.4"]

to your project's `:plugins`, then placing the following at the bottom
of `project.clj`:

    (cemerick.pomegranate.aether/register-wagon-factory! "dav"
      #(eval '(org.apache.maven.wagon.providers.webdav.WebDavWagon.)))
  
That's a bit of a pain, so this plugin brings in
`wagon-webdav-jackrabbit`, and registers the correct wagon factory for
you. And that's all it does.

## Usage

Put `[lein-webdav "0.1.0"]` into the `:plugins` vector of your
project.clj, then use the built-in `deploy` task (`some-repo` should
be defined as a `dav:` repo in `:deploy-repositories` in your project,
run `lein sample` for more details):

    $ lein deploy some-repo

## License

Copyright © 2014 Toby Crawley

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
