import java.io.InputStream;
import java.io.FileInputStream
import java.io.File;
import javax.xml.transform.stream.StreamSource

def hudson = hudson.model.Hudson.instance;

//to get a single job
def job = hudson.model.Hudson.instance.getItem('OMERO-Beta4.1');
def configXMLFile = job.getConfigFile();
def file = configXMLFile.getFile();
println "Reloading " + file
InputStream is = new FileInputStream(file);
job.updateByXml(new StreamSource(is));
job.save();
