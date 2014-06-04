item=hudson.model.Hudson.instance.getItem("OMERO-5.1-merge-build")
//build = item.getLastBuild()   
builds = item.getBuilds()   
//println build.getTime()
abcd=""
  builds.each { result=it.getResult().toString().equals("SUCCESS") 
    if (it.getResult().toString().equals("SUCCESS"))
    {
        abcd+= it.getNumber() +","
        }
    // it.keepLog(false)
    if (it.getWhyKeepLog())
    {it.deleteArtifacts()}
  }

// println abcd[0..-2]
