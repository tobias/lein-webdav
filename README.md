# lein-webdav

A Leiningen plugin that enables deploying to a webdav repository.

## Rationale

You can currently deploy to a webdav repo by adding:

    [org.apache.maven.wagon/wagon-webdav-jackrabbit "2.4"]

to your project's `:plugins`, then creating a `leiningen/wagons.clj`
somewhere, containing:

    {"dav" #(org.apache.maven.wagon.providers.webdav.WebDavWagon.)}

then creating a `.lein-classpath` in your project root containing the
path to the dir containing `leiningen/wagons.clj`.

That's a bit of a pain, so this plugin brings in
`wagon-webdav-jackrabbit`, and puts the proper `leiningen/wagons.clj`
on the lein classpath. And that's all it does.

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
