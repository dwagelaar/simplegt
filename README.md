# SimpleGT
SimpleGT is a minimal [graph transformation](http://www.gratra.org/) language. SimpleGT is built on top of the [Eclipse Modeling Framework (EMF)](http://www.eclipse.org/modeling/emf/), [EMFText](http://www.emftext.org/), and [SimpleOCL](http://code.google.com/a/eclipselabs.org/p/simpleocl), and is intended as a proof-of-concept transformation language for the [EMF Transformation Virtual Machine (EMFTVM)](http://wiki.eclipse.org/ATL/EMFTVM).

Below you can find an example of SimpleGT code:

```
module graphDeleteN1Inplace debug;

metamodel Graph : 'platform:/resource/TTC2011/metamodels/graph.ecore';
transform g : Graph;

abstract rule N1 {
	from n1 : Graph!Node (name =~ 'n1')
	to n1 : Graph!Node (name =~ 'n1')
}

rule DeleteIncidentEdge extends N1 {
	from e : Graph!Edge (trg =~ n1),
		n1 : Graph!Node (name =~ 'n1')
	to n1 : Graph!Node (name =~ 'n1')
}

rule DeleteN1 extends N1 {
	from n1 : Graph!Node (name =~ 'n1')
}
```

This code transforms a model "g" that conform to the "Graph" metamodel. It first deletes all incoming edges to all nodes named "n1", and then deletes all nodes named "n1". For detailed examples, check out the [TTC 2011 Hello World](http://soft.vub.ac.be/viewvc/TTC2011/) Eclipse project from Subversion:

```svn co http://soft.vub.ac.be/svn-pub/TTC2011/```

Some more background on the included transformations can be found in the [TTC 2011 hello world assignment](http://is.ieis.tue.nl/staff/pvgorp/events/TTC2011/cases/ttc2011_submission_3.pdf) and the [README.txt](http://soft.vub.ac.be/svn-pub/TTC2011/README.txt) file included in the above Eclipse project folder.

**Update:** SimpleGT now also supports **unique** rules. Unique rules only match once against each distinct input pattern, preventing infinite applications of the same rule to the same pattern. **(16/02/2012)**

SimpleGT/EMFTVM performance is quite good compared to other graph transformation tools. [Here](https://github.com/dwagelaar/simplegt/raw/master/org.eclipselabs.simplegt.benchmarks/SimpleGTBenchmarks.pdf) you can find an (informal) performance comparison based on [Gergely Varró's STS benchmark](http://www.cs.bme.hu/~gervarro/benchmark/2.0/).

## Installation
To download and install the SimpleGT Eclipse plugin, install it from the Eclipse update site:

<a href="http://marketplace.eclipse.org/marketplace-client-intro?mpc_install=609069" class="drag" title="Drag to your running Eclipse workspace to install SimpleGT"><img class="img-responsive" src="https://marketplace.eclipse.org/sites/all/themes/solstice/public/images/marketplace/btn-install.png" alt="Drag to your running Eclipse workspace to install SimpleGT" /></a> or https://raw.githubusercontent.com/dwagelaar/simplegt/master/org.eclipselabs.simplegt.updatesite/

## Running SimpleGT/EMFTVM modules
EMFTVM includes a separate launch configuration dialog that looks very much like ATL's launch configuration dialog. It can be found via "Run -> Run Configurations...".

![EMFTVM launch configuration dialog](https://wiki.eclipse.org/images/d/d4/Emftvmlaunchconfiguration.png)

## Publications
* Dennis Wagelaar, Massimo Tisi, Jordi Cabot, Frédéric Jouault. [**Towards a general composition semantics for rule-based model transformation**](http://soft.vub.ac.be/Publications/2011/vub-soft-tr-11-07.pdf). ACM/IEEE 14th International Conference on Model Driven Engineering Languages and Systems (MoDELS 2011).

## Links
* [SimpleOCL](https://github.com/dwagelaar/simpleocl)
* [ATL/EMFTVM documentation on Eclipse.org](http://wiki.eclipse.org/ATL/EMFTVM)
