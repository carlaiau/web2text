package nl.tvogels.boilerplate.features.extractor

import nl.tvogels.boilerplate.cdom.{Node,CDOM}
import nl.tvogels.boilerplate.features.BlockFeatureExtractor

/** @todo add description */
case class RootExtractor(extractor: BlockFeatureExtractor) extends BlockFeatureExtractor {

  /** Prefix for these features */
  val prefix = "root_"

  /** Add a prefix to a list of the features */
  private def addPrefix(labels: Vector[String], prefix: String): Vector[String] =
    labels map { prefix + _}

  /** Return the labels of this extractor, transformed from before */
  val labels = addPrefix(extractor.labels, prefix)

  def apply(cdom: CDOM): (Node) => Vector[Double] = {
    val rootFeatures = extractor(cdom)(cdom.root)
    (node: Node) => rootFeatures
  }

}