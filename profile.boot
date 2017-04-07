(set-env! :repositories
          [["clojars" "http://clojars.org/repo/"]
           ["maven-central" "http://repo1.maven.org/maven2/"]
           ["provisdom" {:url        "s3p://provisdom-artifacts/releases/"
                         :username   (System/getenv "AWS_ACCESS_KEY_ID")
                         :passphrase (System/getenv "AWS_SECRET_ACCESS_KEY")}]]
          :wagons '[[s3-wagon-private "1.2.0"]])