package info.tkachuko.coursera.ml

import breeze.linalg.Matrix
import info.tkachuko.coursera.ml.types.RegressionType

trait SupervisedLearning {

  def X: Matrix[Double]

  def Y: Matrix[Double]

  def θ: Matrix[Double]

  def `type`: RegressionType
}